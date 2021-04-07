# RecycleViewOverScrollModeDemo

# 关于RecycleView的overScrollMode属性的一点探索

这个属性本身没有特别重要的功能，只是针对滑动做的一个动效，算是锦上添花的一个东西吧。

这个属性是在Sdk 21之后添加的，故在21之前的版本上无法显示。

## 1. 属性设置后的效果：

在RecycleView可以滑动的时候，如果滑动到顶部或者底部，会显示一个过度滑动的动画效果。这个属性默认设置为always，可以手动修改。

## 2. 在xml中设置：

```xml
        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/rv"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:overScrollMode="always"
            android:scrollbars="none"
            tools:itemCount="5"
            tools:listitem="@layout/item_rv" />
```

## 3. 在代码中设置：

mode 共有三种模式可以设置，分别是： 

1. **OVER_SCROLL_ALWAYS**（ Always allow a user to over-scroll this view, provided it is a view that can scroll. ）

2. **OVER_SCROLL_IF_CONTENT_SCROLLS** （ Allow a user to over-scroll this view only if the content is large enough to meaningfully scroll, provided it is a view that can scroll ）

3. **OVER_SCROLL_NEVER** （ Never allow a user to over-scroll this view ）

-----

1. Kotlin

```kotlin
mDataBinding.rv.overScrollMode = View.OVER_SCROLL_ALWAYS
```

2. Java

```java
recyclerView.setOverScrollMode(View.OVER_SCROLL_ALWAYS);
```

## 4. 修改EdgeEffect的颜色

如果不手动设置颜色，默认使用App的主题色，即 colorPrimary 。

如需修改颜色，可以通过设置style的方式来修改颜色。

``` xml
<item name="android:colorEdgeEffect">@android:color/holo_red_light</item>
```

这里就是把显示的颜色修改为红色。



项目相关源码已经上传github，

[点击跳转]: 

