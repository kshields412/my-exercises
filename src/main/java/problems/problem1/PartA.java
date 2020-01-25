package problems.problem1;

public class PartA {
    private final Integer[] sortedList;

    public PartA(Integer[] randomList) {
        this.sortedList = this.sortList(randomList);
    }

    public int numOfUnique() {
        int count = 0;
        for (int i = 0; i < sortedList.length; i++) {
            Integer currentVal = sortedList[i];
            boolean lastIteration = i == sortedList.length - 1;
            if (!lastIteration) {
                Integer nextVal = sortedList[i+1];
                boolean isDuplicate = currentVal.equals(nextVal);
                // if sees duplicate
                if (isDuplicate) {
                    // iterate until we're at the end of consecutive duplicates
                    i = this.getEndOfConsecutive(i);
                } else {
                    count++;
                }
            } else {
                Integer previousVal = sortedList[i - 1];
                if(!currentVal.equals(previousVal)){
                    count++;
                }
            }
        }
        return count;
    }

    private int getEndOfConsecutive(int currentIndex) {
        int currentVal = sortedList[currentIndex];
        for (int j = currentIndex + 1; j < sortedList.length; j++) {
            Integer nextPotentialDuplicate = sortedList[j];
            Boolean isDuplicate = currentVal == nextPotentialDuplicate;
            if (!isDuplicate) {
                currentIndex = j -1;
                break;
            }
        }
        return currentIndex; // last index of the consecutive duplicate space
    }


    private Integer[] sortList(Integer[] randomNumList) {
        for (int i = 0; i < randomNumList.length - 1; i++) {
            for (int j = 0; j < randomNumList.length - i - 1; j++) {
                if (randomNumList[j] > randomNumList[j + 1]) {
                    // swapping indexes of randomNumList[j+1] and randomNumList[i]
                    int temp = randomNumList[j];
                    randomNumList[j] = randomNumList[j + 1];
                    randomNumList[j + 1] = temp;
                }
            }
        }
        return randomNumList;
    }
}
