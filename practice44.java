//4.定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出

class practice44 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 0,7,8,9};
            int max = a[0];
            int index=0;
            for (int i = 0; i < a.length;i++){
                if(max<a[i]){
                    max=a[i];
                    index=i;
                }
            }
            System.out.println(max);
            System.out.println(index);
    }
}