
public class MultiDimArray {

	public static void main(String[] args) {
		
		// define 2D array
        int nums[][] = new int[3][4];

        //define which values should be on each position
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                nums[i][j] = (int)(Math.random() * 10);
              
            }
            
        }
        
// 		for-loop:
        
//        for (int i = 0; i < 3; i++) {
//
//            for (int j = 0; j < 4; j++) {
//                
//                System.out.print(nums[i][j] + " ");
//            }
//
//            System.out.println();
//
//        }
        
        //alternative loop method using for-each:
        	
        for(int n[] : nums) {
        	
        	for(int m: n) {
        		
        		System.out.print(m + " ");
        	}
        	
        	 System.out.println();
        }
		

	}

}
