package InstituteManagement.InstituteManagement;

public class Institute {

	int deptId ;
	Department s;
	
	Department oldArray[] = new Department[2];
	
	
	Institute(int deptId, Department s){
		
		this.deptId = deptId;
		this.s = s;
		 
	}
	Institute(){}
	
	
	public void add(Department s) {
		
		int count = 0;
		int counter = 0;
		
		for (int x=0; x < oldArray.length; x++) {
			
			if (oldArray[x] != null) {
				count +=1;
			}
		        
			if (x == oldArray.length-1) {
				
				Department newArray[] = new Department[oldArray.length+2];
				//arraycopy(Object source_arr, int sourcePos,Object dest_arr, int destPos, int len)
				System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
				oldArray = newArray;
			}
			
			if(oldArray[count]==null && counter==0) {
				oldArray[count]=s;
				counter++;
				break;
			}
			
			
		}
			
	}
	
	public void show() {
	    int c = 0;
	    for(Department el: oldArray) {
	    	
	    	if(el != null) {
	    		
	    		System.out.println(el.getStudentRef().getName());
	    		
	    	}
	    	
	    }
	}
	
	
}

