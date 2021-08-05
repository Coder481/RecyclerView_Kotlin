package com.hrithik.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hrithik.recyclerviewkotlin.databinding.FoodItemLayoutBinding


class FoodItemAdapter(private val context: Context, private val foodItemList:MutableList<FoodItem>)
    : RecyclerView.Adapter<FoodItemAdapter.FoodItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        val binding = FoodItemLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return FoodItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        val foodItem = foodItemList[position]
        holder.bind(foodItem)
    }

    override fun getItemCount(): Int {
        return foodItemList.size
    }


    class FoodItemViewHolder(foodItemLayoutBinding: FoodItemLayoutBinding)
        : RecyclerView.ViewHolder(foodItemLayoutBinding.root){

        private val binding = foodItemLayoutBinding

        fun bind(foodItem: FoodItem){
            binding.foodItemNameTV.text = foodItem.name
            binding.foodItemPriceTV.text = "Rs. ${foodItem.price}"
        }

    }
}