public class Trainee {
    String traineeRole;
    int traineeTaskComplete;

    public Trainee(String name, int age, String dateOfBirth, 
                    String Department, String skill,
                     String role, int taskComplete) {
	super(name, age, dateOfBirth, Department, skill);
	traineeRole = role;
	traineeTaskComplete = taskComplete;
    }

    public String getTraineeRole() {
	return traineeRole;
    }

    public int getTrainee() {
	return trainerProject;
    }
}