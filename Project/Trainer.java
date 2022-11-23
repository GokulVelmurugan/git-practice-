public class Trainer extends Employee {
    int trainerExperience;
    String trainerProject;

    public Trainer (String name, int age, String dateOfBirth, 
                    String Department, int experience, String skill, 
                    String project) {
	super(name, age, dateOfBirth, Department, skill);
	trainerExperience = experience;
	trainerProject = project;
    }

    public int getTrainerExperience() {
	return trainerExperience;
    }

    public String getTrainerProject() {
	return trainerProject;
    }
}