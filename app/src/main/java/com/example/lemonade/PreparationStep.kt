package com.example.lemonade

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.lemonade.PreparationStep.EmptyingGlass
import com.example.lemonade.PreparationStep.RefreshingGlass
import com.example.lemonade.PreparationStep.SelectLemon
import com.example.lemonade.PreparationStep.SqueezeLemon

sealed class PreparationStep(@StringRes val label : Int, @DrawableRes val resourceId: Int, @StringRes val description : Int ) {

    data object SelectLemon : PreparationStep(R.string.lemon_select_label, R.drawable.lemon_tree, R.string.lemon_tree_content_description)
    data object SqueezeLemon : PreparationStep(R.string.lemon_squeeze_label, R.drawable.lemon_squeeze, R.string.lemon_content_description)
    data object RefreshingGlass : PreparationStep(R.string.drink_lemonade_label, R.drawable.lemon_drink, R.string.lemonade_glass_content_description)
    data object EmptyingGlass : PreparationStep(R.string.empty_glass_label, R.drawable.lemon_restart, R.string.empty_glass_content_description)


    companion object {
        val Steps = hashMapOf(0 to SelectLemon, 1 to SqueezeLemon, 2 to RefreshingGlass, 3 to EmptyingGlass)
    }
}
