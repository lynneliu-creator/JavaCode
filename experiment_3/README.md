# experiment_3

1 点-圆-圆柱体之间的继承关系

2 设计一个人员类（Person），其中包含一个方法pay，代表人员的工资支出，再从Person类派生出教师类（Teacher）和大学生类（CollegeStudent），其中
   教师的工资支出为：基本工资+授课时数×30
   大学生的工资支出为：奖学金支出
（1）将人员类定义为抽象类，pay为抽象方法，设计程序实现多态性
（2）pay定义在接口中，设计程序实现多态性

3 定义一个shape类的抽象类，里面含有一个求面积的抽象方法area（）。编写其子类圆形Circle，矩形Rectangle以及正方形Square。随机生成100个Circle、Rectangle以及Square（半径或边长也随机生成），放入shape类数组中，求他们的总面积。
分别要求：
（1）使用多态完成此题
（2）使用instanceof判断完成此题
（3）定义shape为接口，完成此题
