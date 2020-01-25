import problems.problem3.ProblemThree;

//import problems.problem3.ProblemThree;
//
public class ProblemThreeDriver {

    public static void main(String[] args) {

        ProblemThree problemThree = new ProblemThree();
        String csvFile = "/Users/kaishields/HealthVerityAssessment/src/main/resources/numberData.csv";
        String[] csvFileData = problemThree.getCSVFileDataAt(csvFile);
        Integer numOfMissing = problemThree.getCountOfMissingNumbers(null);
        System.out.println(numOfMissing);


    }
}
