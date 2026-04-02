import java.util.Arrays;
public class heapSort{
<<<<<<< HEAD

    static String[] heap;
    static int size;

    public static void main(String[] args) {

        //small test 1
         String[] small_test = { "pear", "strawberry", "kiwi", "orange","grapes", "apple"};
         System.out.println("Original array:");
         System.out.println(Arrays.toString(small_test));

         //bottom-up test
         String[] array1 = Arrays.copyOf(small_test, small_test.length);
         long start1 = System.nanoTime();
         buildHeapBottomUp(array1);
         heapSort();
         long end1 = System.nanoTime();
         System.out.println("\nBottom-up sorted:");
         System.out.println(Arrays.toString(heap));
         System.out.println("Time: " + (end1-start1) + "ns");

         //top-down test
         String [] array2 = Arrays.copyOf(small_test,small_test.length);
         long start2 = System.nanoTime();
         buildHeapTopDown(array2);
         heapSort();
         long end2 = System.nanoTime();
         System.out.println("\nTop-down sorted:");
         System.out.println(Arrays.toString(heap));
         System.out.println("Time:" + (end2-start2) + "ns");
    }
         //bottom-up heap build
         public static void buildHeapBottomUp(String[] array){
                heap =array;
                size=array.length;
                for(int i=size/(2) - 1; i>=0;i--){
                    heapify(i);
                }
         }
        //top-down heap build

        public static void buildHeapTopDown(String[] array){
            heap =new String[array.length];
            size = 0;

            for(String word: array){
                insert(word);
            }
        }
        //insert for top down

        public static void insert(String word){
            heap[size] = word;
            int i = size;
            size++;

            while(i>0 && heap[(i-1)/2].compareTo(heap[i]) <0){
                swap(i,(i-1)/2);
                i= (i-1)/2;
            }
        }
        //heapify for  botton up + sort

        public static void heapify(int i){
            int largest = i;
            int left = 2 * i +  1;
            int right = 2 * i + 2;

            if(left<size && heap[left].compareTo(heap[largest]) >0){
                largest=left;
            }
            if(right<size && heap[right].compareTo(heap[largest]) >0){
                largest=right;
            }
            if(largest != i){
                swap(i,largest);
                heapify(largest);
            }
        }
        //heapsort

        public static void heapSort(){
            int originalSize = size;

            for(int i = size - 1 ; i > 0 ;i--){
                swap(0,i);
                size--;
                heapify(0);
            }
            size = originalSize;
        }

        //swap helper
        
        public static void swap(int i,int j){
            String temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

                
            }


 
=======
>>>>>>> 62e7252 (commit to submit)

    static String[] heap;
    static int size;

    public static void main(String[] args) {

        //small test 1
         String[] small_test = { "pear", "strawberry", "kiwi", "orange","grapes", "apple"};
         System.out.println("Original array:");
         System.out.println(Arrays.toString(small_test));

         //bottom-up test
         String[] array1 = Arrays.copyOf(small_test, small_test.length);
         long start1 = System.nanoTime();
         buildHeapBottomUp(array1);
         heapSort();
         long end1 = System.nanoTime();
         System.out.println("\nBottom-up sorted:");
         System.out.println(Arrays.toString(heap));
         System.out.println("Time: " + (end1-start1) + "ns");

         //top-down test
         String [] array2 = Arrays.copyOf(small_test,small_test.length);
         long start2 = System.nanoTime();
         buildHeapTopDown(array2);
         heapSort();
         long end2 = System.nanoTime();
         System.out.println("\nTop-down sorted:");
         System.out.println(Arrays.toString(heap));
         System.out.println("Time:" + (end2-start2) + "ns");
    }
         //bottom-up heap build
         public static void buildHeapBottomUp(String[] array){
                heap =array;
                size=array.length;
                for(int i=size/(2) - 1; i>=0;i--){
                    heapify(i);
                }
         }
        //top-down heap build

        public static void buildHeapTopDown(String[] array){
            heap =new String[array.length];
            size = 0;

            for(String word: array){
                insert(word);
            }
        }
        //insert for top down

        public static void insert(String word){
            heap[size] = word;
            int i = size;
            size++;

            while(i>0 && heap[(i-1)/2].compareTo(heap[i]) <0){
                swap(i,(i-1)/2);
                i= (i-1)/2;
            }
        }
        //heapify for  botton up + sort

        public static void heapify(int i){
            int largest = i;
            int left = 2 * i +  1;
            int right = 2 * i + 2;

            if(left<size && heap[left].compareTo(heap[largest]) >0){
                largest=left;
            }
            if(right<size && heap[right].compareTo(heap[largest]) >0){
                largest=right;
            }
            if(largest != i){
                swap(i,largest);
                heapify(largest);
            }
        }
        //heapsort

        public static void heapSort(){
            int originalSize = size;

            for(int i = size - 1 ; i > 0 ;i--){
                swap(0,i);
                size--;
                heapify(0);
            }
            size = originalSize;
        }

        //swap helper
        
        public static void swap(int i,int j){
            String temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

                
            }


 
