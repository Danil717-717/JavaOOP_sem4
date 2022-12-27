package data.comparators;

import data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {
    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        int o10 = o1.getStudentGroup().size();
        int o20 = o2.getStudentGroup().size();
        return Integer.compare(o10, o20);
    }

}
