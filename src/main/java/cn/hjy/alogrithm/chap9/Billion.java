package cn.hjy.alogrithm.chap9;


/**
 *  在10亿个数中找出最大的1万个数
 *    有10亿个整形数字，求这10亿个数字中最大的1万个数
 *    在一般语言中一个整形数字占4字节，10亿个数字大概占到了4GB的空间。
 *
 *    无脑解法：把所有数据都放到内存里，建议一个数组，然后循环1万次，
 *    每次对数组进行遍历来得到最大的数，然后与数组最后位置的元素进行交换，在排除掉最后的元素后继续找最大的数，如此遍历1万次。
 *  如果数字的数量非常少，可以用，如果数字的数量 很多，要真的这样解，则基本上得需要几个小时了。
 *  时间复杂度O(n*m) n为10亿，m为1万
 *
 *
 *
 *  快排： 时间复杂度O(nlogn)
 *
 *  不全部放入内存：
 *          只要求得到最大的1万个数，并没有要求对所有数排序，也就是我们并不需要关心剩余的数的顺序是怎么样的。
 *          建立一个长度为1万的数组，对10亿个数进行遍历(文件，网络方式获取)，遍历前1万的数并放入数组中，同时记录最小的一个元素值。
 *          在判断第1万个数之后的数时，我们会判断这个元素的值是否小于这1万个元素中最小的数，如果小于，就什么都不用管；
 *          否则，就把在最小元素的值设置为这个新的值，同时遍历一遍这1万个数，找出最小元素并记录下来。
 *          最终遍历一次这10亿个数，就得到结果了，并且内存中永远只存着这个只有1万长度的数组。
 *          最坏结果O((n-m)*m) n为10亿，m为1万，最好情况O(n),这时10亿个数刚好是有序的。
 *          平均性能而言，效率提高不少，更重要的是不需要把所有的值一次性读入内存了。
 *
 *
 *  大顶堆： 首先建立一个空间为1万的堆，这个堆应该是最小堆，堆顶的元素就是最小的元素。
 *          每次读取一个元素的时候，判断堆是否已满，如果满了，就说明够1万个元素了，接下来判断元素是否大于堆顶的元素，
 *          如果大于，就删除堆顶的元素，然后插入新元素，插入时自然就会重建堆了。重建堆的时间复杂度为O(log n),性能好很多，时间复杂度变味了O((n-m)*logn),性能达到最优了。
 *
 *
 *
 *
 * */

public class Billion {
}
