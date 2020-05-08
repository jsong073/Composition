import java.util.ArrayList;

public class Education {
    private ArrayList<String> schools;

    public Education() {
        schools = new ArrayList<String>();
    }

    public Education(ArrayList<String> schools) {
        this.schools = schools;
    }

    public Education(String school) {
        schools.add(school);
    }

    public ArrayList<String> getSchools() {
        return schools;
    }

    public void setSchools(ArrayList<String> schools) {
        this.schools = schools;
    }

    public void addSchool(String school) {
        schools.add(school);
    }

    @Override
    public String toString() {
        String output = "Education: \n";
        for (String str: schools) {
            output += str + "\n";
        }
        return output;
    }
}
