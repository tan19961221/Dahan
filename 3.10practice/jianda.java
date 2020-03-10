1.什么是封装
封装是面向对象方法的重要原则，就是把对象的属性和操作（或服务）结合为一个独立的整体，并尽可能隐藏对象的内部实现细节。对外提供公共访问方式。
2.static关键字的特点
a、static是一个修饰符，用于修饰成员。（成员变量，成员函数）static修饰的成员变量 称之为静态变量或类变量。
b、static修饰的成员被所有的对象共享。
c、static优先于对象存在，因为static的成员随着类的加载就已经存在。
d、static修饰的成员多了一种调用方式，可以直接被类名所调用，（类名.静态成员）。
e、static修饰的数据是共享数据，对象中的存储的是特有的数据。
3.&&和&  ||和|的区别
&&和&都是表示与，区别是&&只要第一个条件不满足，后面条件就不再判断。而&要对所有的条件都进行判断。
||和|都是表示“或”，区别是||只要满足第一个条件，后面的条件就不再判断，而|要对所有的条件进行判断。
4.一个".java"源文件中是否可以包括多个类（不是内部类）？有什么限制？
可以有多个类，但只能有一个public的类，并且public的类名必须与文件名相一致。一个文件中可以只有非public类，如果只有一个非public类，此类可以跟文件名不同。
5.什么叫方法的重写
在Java 程序中，类的继承关系可以产生一个子类，子类继承父类，它具备了父类所有的特征，继承了父类所有的方法和变量。
子类可以定义新的特征，当子类需要修改父类的一些方法进行扩展，增大功能，程序设计者常常把这样一种操作方法称为重写，也可以叫覆写或覆盖。
6.静态方法,静态代码块,构造函数代码块,构造代码块执行先后顺序
静态代码块 静态方法 构造代码块  构造函数代码块







