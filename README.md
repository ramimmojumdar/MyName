
<h3> how do add text in lottie animation </h3>
![Screenshot_35](https://github.com/ramimmojumdar/MyName/assets/76879234/486c504e-34d0-4d8f-a343-a49685c4a68a)

<h4> we can use FrameLayout or follow this code </h4>

<p> 
<FrameLayout </p>
        android:layout_width="match_parent"  
        android:layout_height="match_parent"> 

<p> 

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text=""
        android:textSize="25sp"
        android:textColor="#fff"
        android:layout_gravity="center"
    />

    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/animationView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:lottie_rawRes="@raw/ani"
        app:lottie_autoPlay="true"
        android:visibility="invisible"
        app:lottie_loop="true"/>


    </FrameLayout>
  
</p>
