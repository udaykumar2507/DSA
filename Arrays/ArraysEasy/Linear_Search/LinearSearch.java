package ArraysEasy.Linear_Search;
public class LinearSearch{
    public static void main(String[] args) {
        int []arr={3,4,53,2,1,45};
        int elememnt=33;
        int flag=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==elememnt){
                System.out.print("It is found in pos "+ (i+1));
                flag=1;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }

    }

}
