package com.example.a11popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        registerForContextMenu(button)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.content_main,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1->{
                Toast.makeText(applicationContext,"SELECTED Item:01('Name')",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.item2->{
                Toast.makeText(applicationContext,"SELECTED ITEM:02('Place')",Toast.LENGTH_LONG).show()
                return true
            }R.id.item3->{
            Toast.makeText(applicationContext,"SELECTED ITEM:03('Things')",Toast.LENGTH_LONG).show()
            return true
        }R.id.item4->{
            Toast.makeText(applicationContext,"SELECTED ITEM:04('Animals')",Toast.LENGTH_LONG).show()
            return true
        }
        }
        return super.onContextItemSelected(item)
    }
}