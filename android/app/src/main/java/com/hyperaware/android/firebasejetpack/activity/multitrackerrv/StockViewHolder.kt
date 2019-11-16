/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hyperaware.android.firebasejetpack.activity.multitrackerrv

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.hyperaware.android.firebasejetpack.databinding.StockPriceListItemBinding
import com.hyperaware.android.firebasejetpack.viewmodel.StockPriceDisplayOrException

internal class StockViewHolder(val binding: StockPriceListItemBinding)
    : RecyclerView.ViewHolder(binding.root), View.OnClickListener {

    init {
        binding.root.setOnClickListener(this)
    }

    var ticker: String? = null
    var stockPriceLiveData: LiveData<StockPriceDisplayOrException>? = null
    var observer: Observer<StockPriceDisplayOrException>? = null
    var itemClickListener: StocksRecyclerViewAdapter.ItemClickListener<StockViewHolder>? = null

    override fun onClick(v: View) {
        itemClickListener?.onItemClick(this)
    }

}
