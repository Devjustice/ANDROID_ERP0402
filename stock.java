package com.example.erp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class stock extends AppCompatActivity {


    ArrayList<String> items;
    ArrayAdapter<String> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);


        //previewitem

        items = new ArrayList<String>();
     /*   items.add("ProductItem1");
        items.add("ProductItem2");
        items.add("ProductItem3");
        items.add("ProductItem4");
*/
        //create adapter

        adapter = new ArrayAdapter<String>(stock.this, android.
                R.layout.simple_list_item_single_choice, items);


        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);//하나의 항목을 선택


    }

    //add.delete 버튼 클릭 실행 메소드
        public void mOnClick(View v) {

            EditText ed = (EditText)findViewById(R.id.newitem);
            switch (v.getId()){
                case R.id.btnadd: //클릭 발생시
                String text=ed.getText().toString();//입력문자열 얻기

            if(!text.isEmpty()){//is not empty
                items.add(text);
                ed.setText("");
                adapter.notifyDataSetChanged();//리스트목록 변경



//notify to adapter
            }
    break;
                case R.id.btnDelete:

                    int pos =listView.getCheckedItemPosition();
                    if(pos != ListView.INVALID_POSITION){
                        items.remove(pos);
                        listView.clearChoices();
                        adapter.notifyDataSetChanged();

            }

break;
        }
    }


//각 목록 버튼 클릭 실행 메소드


    public void getList(View v){

        switch(v.getId()){
            case R.id.btnProductList:

                //기존 데이터 초기화하고 새로추가

       items.clear();
       items.add("productnew1");
       items.add("productnew2");

       adapter.notifyDataSetChanged();//renew
                break;




            case R.id.btnWorkList: //일목록



           items.clear();

                items.add("worknew1");
                items.add("worknew2");

                adapter.notifyDataSetChanged();//renew
                break;
        }



    }









}//eod
