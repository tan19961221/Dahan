class paixu 
{
    public static void sortStringqw(String[] qw)
     {
        String temp;
        for (int i = 0; i < qw.length; i++) 
        {
            for (int j = qw.length - 1; j > i; j--) 
            {
                if (qw[i].length() > qw[j].length()) 
                {
                    temp = qw[i];
                    qw[i] = qw[j];
                    qw[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        String[] qw = { "qq", "qqq", "q" ,"qwer","q111q", "q3123123qq", "efvbbgdbbq" ,"q1wer","q22" ,"q34wer"};
        sortStringqw(qw);
        for (int i = 0; i < qw.length; i++) 
        {
            System.out.println(qw[i]);
        }
    }

}