package com.strongant.algorithm;

public class Main {

    public static void main(String[] args) {

        //逻辑结构（包含集合、线性结构、树形结构、图状结构）
        //存储结构 顺序、链式、索引、散列,最为常见的为顺序和链式结构
        //数据的运算 插入、删除、修改、查找、排序
        //常见的数据结构： 线性表(线性)、栈(线性)、队列(线性)、树（非线性）、图(非线性)

        //算法概念
        //算法和数据结构的区别
        //特定的问题明确计算过程
        //算法是解决问题的有限序列和思想

        //算法特点
        //输入：算法至少有0个或者多个输入
        //输出：算法至少有一个或者多个输出
        //有穷性：算法在有限的步骤之后会自动结束，而不会无限循环
        //确定性：算法中的每一步都有确定的意义，不会产生歧义
        //可行性：算法的每一步都是可行的

        //算法和数据结构的区别
        //数据结构只是静态解决的描述了数据之间的关系
        //算法是为了解决问题而设计的
        //数据结构是算法需要处理的问题的载体
        //高效的程序需要在数据结构的基础上设计和选择算法
        //数据结构与算法是相辅相成的
        //程序 = 数据结构 + 算法

        //算法的度量
        //影响算法效率的主要因素有：
        //算法采用的策略和方法
        //问题的输入规模
        //编译器产生的代码
        //计算机的执行速度

        //算法的时间复杂度
        //算法阿德效率严重依赖于操作数量
        //在判断首先关注操作数量的最高次项
        //操作数量的估算可以作为时间复杂度的估算
        //去掉表示算法运行时间中的低阶项目和首项常数，就是度量算法的渐进时间复杂度，简称时间复杂度。
        //时间复杂度通常由符号O表示，例如：遍历一个具有n个元素的数组，其时间复杂度可以表示为O(n)

        //算法的空间复杂度
        //为了求解问题所需要的存储空间的数目，但是它不包含用来存储输入实例的空间。算法的空间复杂度铜鼓计算算法的存储空间实现。符号O同样适用于算法的空间复杂度，例如：
        //当算法执行时所需要的空间是常数时，空间复杂度为O(1)
        //多数情况下：关注时间复杂度，使用空间复杂度换时间复杂度，采用时间复杂度换取空间复杂度

        //计算循环次数
        //分析高频度的基本

    }
    public static int function01(int n){
        int i = 0;
        int count = 0;
        while(i<=n){
            i = i * 5;
            count++;
        }
        return count;
    }
}
