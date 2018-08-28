# ListViewDemo
Simple listView demo with statically binding the datasource using XML and dynamically using the string Arrays and ArrayList.

ListView are used to display the data in an vertical(portrait) mode.

XML
You can populate the listview directly by creating a string array 
<string-array name="days">
        <item>Monday</item>
        <item>Tuesday</item>
        <item>Wednesday</item>
        <item>Thursday</item>
        <item>Friday</item>
        <item>Saturday</item>
</string-array>
        in the values folder and providing the android:entries="@array/days" directly.
OR

JAVA
1.create a string[] or an arraylist and then populate the arraylist using the add() method.
2.initialize your ListView in the OnCreate().
3.create an arrayAdapter
  ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1, mDays);
  which takes three parameters i.e 1)Context 2)how you want your list to be shown OR Layout 3) your dataSource i.e. your string[] or arraylist.
4.on the listview set the adpater using the setAdapter method call.
  mStringListView.setAdapter(arrayAdapter);
  
  Hope it was usefull to you.
  Happy Coding! :)
