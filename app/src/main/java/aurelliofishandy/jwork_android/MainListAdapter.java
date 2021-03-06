package aurelliofishandy.jwork_android;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * @author (Aurellio Fishandy)
 * @version (Modul 2 - 29-Jun-2021)
 */
public class MainListAdapter extends BaseExpandableListAdapter {
    // Variabel yang dibutuhkan
    private Context _context;
    private List<Recruiter> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<Recruiter, ArrayList<Job>> _listDataChild;


    public MainListAdapter(Context context, List<Recruiter> listDataHeader,
                           HashMap<Recruiter, ArrayList<Job>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }

    
    /**
     * Menagmbil data Child
     * @param groupPosition
     * @param childPosititon
     * @return Object
     */
    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return _listDataChild.get(_listDataHeader.get(groupPosition))
                .get(childPosititon).getName();
    }

    
    /**
     * Mengambil ID Child
     * @param groupPosition
     * @param childPosition
     * @return long
     */
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    
    /**
     * Memperlihatkan Child yang kita miliki kedalam List Item
     * @param groupPosition
     * @param childPosition
     * @param isLastChild
     * @param convertView
     * @param parent
     * @return View
     */
    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.layout_job, null);
        }

        TextView txtListChild = (TextView) convertView
                .findViewById(R.id.lblListItem);

        txtListChild.setText(childText);
        return convertView;
    }

    
    /** 
     * @param groupPosition
     * @return int
     */
    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    
    /** 
     * @param groupPosition
     * @return Object
     */
    @Override
    public Object getGroup(int groupPosition) {
        Recruiter r = this._listDataHeader.get(groupPosition);
        return r.getName();
    }

    
    /** 
     * @return int
     */
    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    
    /** 
     * @param groupPosition
     * @return long
     */
    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    
    /**
     * Membuat Recruiter disimpan/ditaruh sebagai Header list
     * @param groupPosition
     * @param isExpanded
     * @param convertView
     * @param parent
     * @return View
     */
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.layout_recruiter, null);
        }

        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean hasStableIds() {
        return false;
    }

    
    /** 
     * @param groupPosition
     * @param childPosition
     * @return boolean
     */
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
