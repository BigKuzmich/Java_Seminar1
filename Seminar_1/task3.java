public static void main(String[]args){

    Scanner in = new Scanner( System.in);
    String str = in.next();

    Double result = null;
    String[] numbers;

    if(str.indexOf( '+' )>0){
        numbers = str.split( "[+]" );
        result = Double.parseDouble( numbers[0] ) + Double.parseDouble( numbers[1] );
    }else if(str.indexOf( '-' )>0){
        numbers = str.split( "[-]" );
        result = Double.parseDouble( numbers[0] ) - Double.parseDouble( numbers[1] );
    }else if(str.indexOf( '/' )>0){
        numbers = str.split( "[/]" );
        result = Double.parseDouble( numbers[0] ) / Double.parseDouble( numbers[1] );
    }else if(str.indexOf( '*' )>0){
        numbers = str.split( "[*]" );
        result = Double.parseDouble( numbers[0] ) * Double.parseDouble( numbers[1] );
    }else{

    }

    System.out.println(result);

}