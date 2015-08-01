package com.bbt.cloudbuypractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
 * 在CloudBuyPratice工程中一共使用了2个Activities,
 * 前面我们知道每使用一个Activity都必须在“AndroidManifest.xml”中
 * 进行声明。
 */
public class AddressEnter extends Activity
{
	private TextView	m_TextView;
	private EditText	m_EditText; 
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		/* 设置显示address_enter.xml布局 */
		setContentView(R.layout.address_enter);
		
		
		m_TextView = (TextView) findViewById(R.id.TextView01);
		m_EditText = (EditText) findViewById(R.id.EditText01);

		m_TextView.setTextSize(20);
		/**
		 * 设置当m_EditText中为空时提示的内容 
		 * 在XML中同样可以实现：android:hint="Enter your destination address please!=请输入你的目的地地址！"
		 */
		m_EditText.setHint("Enter your destination address please!");
		
		m_EditText.setOnKeyListener(new EditText.OnKeyListener() {
			@Override
			public boolean onKey(View arg0, int arg1, KeyEvent arg2)
			{
				// TODO Auto-generated method stub
				// 得到文字，将其显示到TextView中
				m_TextView.setText("The address is:" + m_EditText.getText().toString());
				return false;
			}
		});
		
		
		/* findViewById(R.id.address_button2)取得布局address_enter.xml中的button2 */
		Button button = (Button) findViewById(R.id.address_button2);
		/* 监听button2的事件信息 */
		button.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v)
			{
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				/* 指定intent要启动的类 */
				intent.setClass(AddressEnter.this, GoogleMap.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				AddressEnter.this.finish();
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
				intent.setClass(AddressEnter.this, GoogleMap.class);
				/* 启动一个新的Activity */
				startActivity(intent);
				/* 关闭当前的Activity */
				AddressEnter.this.finish();
				break;
			case R.id.exit:
				AddressEnter.this.finish();
				break;
		}
		return true;
	}
}
