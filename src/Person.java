public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;
    public Person(){
        this.job=new Job();
        this.education = new Education();
        job.setSalary(1000L);
        education.addSchool("Montgomery College");
        education.addSchool("Jefferson High School");
        education.addSchool("Dad Works Abroad High School");
        education.addSchool("Always Moving to Another State High School");
        education.addSchool("International Student High School");
        education.addSchool("Some Middle School");
        education.addSchool("Another School");
        education.addSchool("Military Life Middle School");
        education.addSchool("Yet Another Middle School");
        education.addSchool("Who Goes to Ten Schools Elementary School");

    }
    public long getSalary() {
        return job.getSalary();
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        String output;
        output = job.toString() + "\n";
        output += education.toString();
        return output;
    }
}