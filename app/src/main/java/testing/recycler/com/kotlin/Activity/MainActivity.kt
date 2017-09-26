package testing.recycler.com.kotlin.Activity

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Toast
import android.support.v7.widget.RecyclerView
import testing.recycler.com.kotlin.R
import testing.recycler.com.kotlin.Adapter.RecyclerViewAdapter


class MainActivity : AppCompatActivity(), View.OnClickListener {
    internal val list = arrayOf("Facebook", "LinkedIn", "Google", "Youtube", "Twitter", "Firebase")
    var linearLayoutManager: LinearLayoutManager? = null
    var mAdapter : RecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener(this)


        val recyclerView = findViewById(R.id.recycler) as RecyclerView
        linearLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = linearLayoutManager
        mAdapter = RecyclerViewAdapter(applicationContext, list)
        recyclerView.adapter = mAdapter


    }
    override fun onClick(view: View) {
        when(view.id){
            R.id.fab -> Toast.makeText(applicationContext,"This is Demo Project",200).show()
            else -> Toast.makeText(applicationContext,"default",200).show()
        }
    }
}
