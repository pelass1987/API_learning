package NextGenEndpoints;

import java.io.IOException;

public class NextGenMainTests {

    public static void main(String[] args) throws IOException {

        Assignment assignment = new Assignment();
        AssignmentSubmissions assignmentSubmissions = new AssignmentSubmissions();
        ActivityFeedbackSaveSubmission activityFeedbackSaveSubmission = new ActivityFeedbackSaveSubmission();
    //    System.out.println(assignment.getAssigment());
    //    System.out.println(assignmentSubmissions.getAssigSubmissions());
        System.out.println(activityFeedbackSaveSubmission.postSaveSubmission());
    }
}
