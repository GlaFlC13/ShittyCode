
public class Main {

	public static void main(String[] args) {
		
		//TODO: make more shitty
		byte[] data = new byte[1];
		data[0] = 0x30;
		
		try{
			Integer i = ((data == null) != false)?(new Integer(null)) : new Integer(Integer.parseInt(String.valueOf("".concat(new String(data)))));
		}catch(NumberFormatException e){
			if((e==null) != false){	}else{
				e.printStackTrace();
				throw new Exception("NumberFormatException occured!");
			}
		}
		finally{
			throw new RuntimeException("ShittyCode");
		}
	}

}
