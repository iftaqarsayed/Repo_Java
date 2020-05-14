package Class9_HW;

public class hw_1 {

    public static void main(String[] args) {
        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        String nameToSearch = "philip";
        int studentAt = nameAt(names, nameToSearch);

        System.out.println(nameToSearch + " is on position -> " + studentAt);
            // can't find a way to sout "is not present in the array" for wrong value
    }
        public static int nameAt(String[] allName, String nameToSearchOf) {
        int indexOfStudent = 0;
            for (int i = 0; i < allName.length; i++) {
                if (allName[i].equals(nameToSearchOf)) {
                    indexOfStudent = i + 1;
                }
            }
            return indexOfStudent;
        }


}
