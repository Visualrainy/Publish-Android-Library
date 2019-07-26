package cn.visual.galleryloader

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_gallery.*

class GalleryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        loading.setOnClickListener {
            loadFromNetwork("https://www.perforce.com/sites/default/files/image/2018-04/image-blog-social-writing-clean-code_0.png")
        }
    }

    private fun loadFromNetwork(url: String) {
        Glide.with(this).load(url).into(structure_iv)
    }
}
