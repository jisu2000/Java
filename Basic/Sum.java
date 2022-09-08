import java.util.stream.IntStream;

public class Sum {
    

          
        
        public static void main(String[] args) {
            int arr[]={1,2,6,2,3,2,2,4};
            int count=0;
            int size=arr.length;
            {
                int i, j;
                
                for (i = 0; i < size-1; i++)
                {
                    for (j = i + 1; j < size; j++)
                    {
                        if (arr[i] == arr[j])

                            count=count+1;
                    }
                }

            }
            System.out.println(count);
            
int sum = IntStream.of(arr).sum();

            
            System.out.println(sum);

        int max=arr[0];
            for(int k=1;k<arr.length;k++)
            {
                if(arr[k]>max)
                max=arr[k];
            }
            System.out.println(max);

            
            
            }

        }
    

