
# 测试一：父子view的方法调用

```
ParentView: ParentView==============构造方法2=========
ChildView: ChildView==============构造方法2=========

ChildView: ChildView==============onMeasure=========
ParentView: ParentView==============onMeasure=========
ParentView: ParentView==============onSizeChanged=========
ChildView: ChildView==============onSizeChanged=========
ChildView: ChildView==============onLayout=========
ParentView: ParentView==============onLayout=========
ChildView: ChildView==============onDraw=========
ChildView: ChildView==============dispatchDraw=========
ParentView: ParentView==============dispatchDraw=========

ChildView: ChildView==============onMeasure=========
ParentView: ParentView==============onMeasure=========
ChildView: ChildView==============onLayout=========
ParentView: ParentView==============onLayout=========
ChildView: ChildView==============onDraw=========
ChildView: ChildView==============dispatchDraw=========
ParentView: ParentView==============dispatchDraw=========
```
执行顺序：

onMeasure、onLayout、onDraw(-->dispatchDraw)：子view先执行，父view后执行

构造方法、onSizeChanged：父view先执行，子view后执行

执行次数：

onMeasure、onLayout、onDrawonDraw(-->dispatchDraw)：执行两次

构造方法、onSizeChanged：执行一次

#　测试二、三、四：scrollview嵌套scrollview滑动冲突











