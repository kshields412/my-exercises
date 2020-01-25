package problems.problem1;

public class ProblemOne {

    public int numOfUnique(Integer[] randomNumList) {
        int count = 0;
        Integer[] sortedList = this.sortList(randomNumList);
        for (int i = 0; i < sortedList.length; i++) {
            if ((i != sortedList.length - 1)) {
                if (sortedList[i] == sortedList[i + 1]) {
                    boolean isDuplicate = false;
                    for (int j = i + 1; j < sortedList.length; j++) {
                        if (sortedList[j] != sortedList[i]) {
                            i = j -1;
                            break;
                        }
                    }
                } else {
                    count++;
                }
            } else{
                if(sortedList[i] != sortedList[i - 1]){
                    count++;
                }
            }




        }
        return count;
    }

    public int numOfUnique1(Integer[] randomNumList) {
        int count = 0;
        Integer[] sortedList = this.sortList(randomNumList);
        for (int i = 0; i < sortedList.length; i++) {
            Integer currentVal = sortedList[i];
            if ((i != sortedList.length - 1)) {
                Integer nextVal = sortedList[i+1];
                boolean isDuplicate = currentVal.equals(nextVal);
                // if sees duplicate
                if (isDuplicate) {
                    // iterate until we're at the end of consecutive duplicates
                    i = this.getEndOfConsecutive(i, randomNumList);
                } else {
                    count++;
                }
            } else{
                Integer previousVal = sortedList[i - 1];
                if(!currentVal.equals(previousVal)){
                    count++;
                }
            }
        }
        return count;
    }

    private int getEndOfConsecutive(int currentIndex, Integer[] list) {
        int currentVal = list[currentIndex];
        for (int j = currentIndex + 1; j < list.length; j++) {
            Integer nextPotentialDuplicate = list[j];
            Boolean isDuplicate = currentVal == nextPotentialDuplicate;
            if (!isDuplicate) {
                currentIndex = j -1;
                break;
            }
        }
        return currentIndex; // last index of the consecutive duplicate space
    }


    public Integer[] sortList(Integer[] randomNumList) {
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
