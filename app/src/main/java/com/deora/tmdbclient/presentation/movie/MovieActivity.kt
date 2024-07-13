package com.deora.tmdbclient.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.deora.tmdbclient.R
import com.deora.tmdbclient.databinding.ActivityMovieBinding
import com.deora.tmdbclient.presentation.di.Injector
import javax.inject.Inject

class MovieActivity : AppCompatActivity()
  {
      @Inject
      lateinit var factory: MovieViewModelFactory
      private lateinit var movieViewModel: MovieViewModel
      private lateinit var binding: ActivityMovieBinding
      private lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_movie)
        (application as Injector).createMoviesSubComponent()
            .inject(this)
        movieViewModel=ViewModelProvider(this,factory)
            .get(MovieViewModel::class.java)
        initRecyclerView()


    }
      private fun initRecyclerView(){
          binding.movieRecyclerView.layoutManager=LinearLayoutManager(this)
          adapter= MovieAdapter()
          binding.movieRecyclerView.adapter = adapter
          displayPopularMovies()
      }
      private fun displayPopularMovies(){
          binding.movieProgressBar.visibility= View.VISIBLE
          val responLiveData=movieViewModel.getMovies()
          responLiveData.observe(this,Observer{
              if(it!=null){
                  adapter.setList(it)
                  adapter.notifyDataSetChanged()
                  binding.movieProgressBar.visibility=View.GONE

              }else{
                  binding.movieProgressBar.visibility=View.GONE
                  Toast.makeText(applicationContext , "No data Available", Toast.LENGTH_SHORT).show()
              }
          })

      }

      override fun onCreateOptionsMenu(menu: Menu?): Boolean {
          val inflater: MenuInflater=menuInflater
          inflater.inflate(R.menu.update,menu)
          return true
      }

      override fun onOptionsItemSelected(item: MenuItem): Boolean  {
          return when (item.itemId){
              R.id.action_update->{
                  updateMovies()
                  true
              }
              else->super.onOptionsItemSelected(item)
          }
         // return
      }
      private fun updateMovies(){
          binding.movieProgressBar.visibility=View.VISIBLE
          val responce =movieViewModel.updateMovies()
          responce.observe(this,Observer{
              if(it!= null){
                  adapter.setList(it)
                   adapter.notifyDataSetChanged()
                  binding.movieProgressBar.visibility=View.GONE
              }else{
                  binding.movieProgressBar.visibility=View.GONE

              }
          })
      }
}