package ibrahim.aytimur.tablayoutviewpagerfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter (fm: FragmentManager): FragmentStatePagerAdapter(fm){
    var sayfalar = listOf(Fragment1(),Fragment2(),Fragment3())
    override fun getItem(position: Int): Fragment {
       return sayfalar[position]
    }

    override fun getCount(): Int {
       return sayfalar.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
       return when(position){
            0 -> "Sayfa1"
            1 -> "Sayfa2"
            else -> "Sayfa3"
        }
    }

}