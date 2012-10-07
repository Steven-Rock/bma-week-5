
public class Assignment3 {
	
	static final String [] actions = {"for", "for-each", "while"};

	public static void main(String [] args){

	     if(!validInputs(args, "main: inputs are empty")){          
	          return;
	     }

	     String action = args[0];
	     if(action == null || action.trim().equals("")){
	          System.out.println("Inputs are empty, an action is required");
	          return;
	     }

	     action = action.trim();
	    
	     
	     boolean found = false;
	     for(int i = 0; i < actions.length; i++){

	          if(action.equals(actions[i])){
	                found = true;
	          }
	     }

	     if(found){
	          System.out.println("match: " + action);
	     }
	     else{
	           System.out.println("no matched actions found " );
	          return;
	     }


	     String[] values = null;
	     if(args.length > 1){
	        
	          values = new String[args.length-1];

	          for(int i = 1; i < args.length; i++){
	               values[i - 1] = args[i];
	          }
	     }

	      for(int i = 0; i < actions.length; i++){

	          if(action.equals(actions[i])){
	                
	               if(action.equals("for")){
	                    testFor(values);
	               }
	               if(action.equals("for-each")){
	                   testForEach(values);
	               }
	               if(action.equals("while")){
	                   testWhile(values);
	               }
	          }
	     }


	}

	static void testForEach(String[] args){
	   
		System.out.println("Testing for-each");

	   if(!validInputs(args, "testForEach: inputs are empty, unable to loop")){          
	          return;
	     }
	   
	   for (String string : args) {
		   System.out.println("for-each: " + string);
	   }
	}

	static void testFor(String[] args){
	      System.out.println("Testing for");

	   if(!validInputs(args, "testFor: inputs are empty, unable to loop")){          
	          return;
	     }
	   
	   for (int i = 0; i < args.length; i++) {
		   System.out.println("for: " + args[i]);
	   }
	}

	static void testWhile(String[] args) {
	      System.out.println("Testing while");

	     if(!validInputs(args, "testWhile: inputs are empty, unable to loop")){          
	          return;
	     }
	     
	     int i = 0;
	     while (i < args.length) {
			
			System.out.println("while: " + args[i]);
			i++;
		}
	}

	static boolean validInputs(String[] args, String msg){
	        
	     if(args == null || args.length == 0){
	          System.out.println(msg);
	          return false;
	     }
	     return true;
	}

}
