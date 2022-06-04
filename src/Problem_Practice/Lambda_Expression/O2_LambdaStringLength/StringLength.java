package Problem_Practice.Lambda_Expression.O2_LambdaStringLength;

public class StringLength {
    public static void main(String[] args) {

        ///StringLengthLambda stringLengthLambda = (s) -> s.length();
        //StringLengthLambda stringLengthLambda = s -> s.length();
        StringLengthLambda stringLengthLambda = (String s) -> s.length();
        int length = stringLengthLambda.getLength("Hello world");
        System.out.println(length);

    }

    interface StringLengthLambda {
        int getLength(String s);
    }

}

// https://youtube.com/playlist?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3