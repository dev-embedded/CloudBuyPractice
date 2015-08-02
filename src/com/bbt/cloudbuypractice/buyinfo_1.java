package com.bbt.cloudbuypractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

public class buyinfo_1 extends Activity{

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		/* 设置显示bufinfo_1.xml布局 */
		setContentView(R.layout.buyinfo_1);
		/* findViewById(R.id.button4)取得布局中的button4 */
		Button button = (Button) findViewById(R.id.button4);
		/* 监听button的事件信息 */
		button.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(buyinfo_1.this, Activity01.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				buyinfo_1.this.finish();
			}
		});
	}
	
}
