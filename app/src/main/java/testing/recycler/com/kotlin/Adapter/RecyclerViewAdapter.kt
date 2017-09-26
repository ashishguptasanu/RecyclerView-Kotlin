package testing.recycler.com.kotlin.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import testing.recycler.com.kotlin.R


/**
 * Created by Ashish on 26-09-2017.
 */

class RecyclerViewAdapter(internal var context: Context, internal var strings: Array<String>) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var textView1: TextView


        init {
            textView1 = itemView.findViewById(R.id.textView1)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_completed, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView1.setText(strings[position])
    }

    override fun getItemCount(): Int {
        return strings.size
    }


}
