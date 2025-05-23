package com.example.judokata.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.judokata.R
import com.example.judokata.model.JudoTechnique
class TechniqueAdapter(private val techniques: List<JudoTechnique>) :
    RecyclerView.Adapter<TechniqueAdapter.TechniqueViewHolder>() {
    inner class TechniqueViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.textViewTechniqueName)
        private val groupTextView: TextView = itemView.findViewById(R.id.textViewTechniqueGroup)
        fun bind(technique: JudoTechnique) { nameTextView.text = technique.name; groupTextView.text = technique.group }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TechniqueViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_technique, parent, false)
        return TechniqueViewHolder(view)
    }
    override fun onBindViewHolder(holder: TechniqueViewHolder, position: Int) { holder.bind(techniques[position]) }
    override fun getItemCount(): Int = techniques.size
}
