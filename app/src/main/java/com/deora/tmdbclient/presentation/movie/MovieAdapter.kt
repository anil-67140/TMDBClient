package com.deora.tmdbclient.presentation.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.deora.tmdbclient.R
import com.deora.tmdbclient.data.model.movie.Movie
import com.deora.tmdbclient.databinding.ListItemBinding

class MovieAdapter : RecyclerView.Adapter<MyViewHolder>() {



        private val movieList= ArrayList<Movie>()

        fun setList(movies:List<Movie>){
            movieList.clear()
            movieList.addAll(movies)
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding :ListItemBinding= DataBindingUtil.inflate(layoutInflater, R.layout.list_item,parent,false)
            return MyViewHolder(binding)
        }

        override fun getItemCount(): Int {
            return movieList.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.bind(movieList[position])
        }
    }

    class MyViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(movie: Movie){
            binding.titleTextView.text=movie.title
            binding.descriptionTextView.text=movie.overview
            val posterURL="https://image.tmdb.org/t/p/w500"+movie.posterPath
            Glide.with(binding.imageView.context)
                .load(posterURL)
                .into(binding.imageView)
        }

    }
