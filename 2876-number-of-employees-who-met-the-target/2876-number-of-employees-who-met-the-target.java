class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int numOfEmp = 0;
        for(int i=0; i<hours.length; i++) {
            if (hours[i] >= target) numOfEmp++;
        }
        return numOfEmp;
    }
}