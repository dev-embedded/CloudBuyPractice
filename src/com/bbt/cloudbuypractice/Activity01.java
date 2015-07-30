package com.bbt.cloudbuypractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

/*
 * 在CloudBuyPratice工程中一共使用了2个Activities,
 * 前面我们知道每使用一个Activity都必须在“AndroidManifest.xml”中
 * 进行声明。
 */
public class Activity01 extends Activity
{
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		/* 设置显示main1.xml布局 */
		setContentView(R.layout.main1);
		/* findViewById(R.id.button1)取得布局main1.xml中的button1 */
		Button button = (Button) findViewById(R.id.button1);
		
		Button button_barcode = (Button) findViewById(R.id.button_barcode);
		/* 监听button的事件信息 */
		button.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(Activity01.this, Activity02.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				Activity01.this.finish();
			}
		});
		
		button_barcode.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(Activity01.this, Activity03.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				Activity01.this.finish();
			}
		});
	}

	/*创建menu*/
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		//设置menu界面为res/menu/activity_menu.xml
		inflater.inflate(R.menu.activity_menu, menu);
		return true;
	}

	/*处理菜单事件*/
	public boolean onOptionsItemSelected(MenuItem item)
	{
		//得到当前选中的MenuItem的ID,
		int item_id = item.getItemId();

		switch (item_id)
		{
			case R.id.go:
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(Activity01.this, Activity02.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				Activity01.this.finish();
				break;
			case R.id.exit:
				Activity01.this.finish();
				break;
		}
		return true;
	}
}
