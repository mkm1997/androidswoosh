package com.pythonanywhere.mkmtutorials.game.Models

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by manish on 10/2/18.
 */
class Player constructor(var Leauge : String,var Skill : String):Parcelable{
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Leauge)
        parcel.writeString(Skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Player> {
        override fun createFromParcel(parcel: Parcel): Player {
            return Player(parcel)
        }

        override fun newArray(size: Int): Array<Player?> {
            return arrayOfNulls(size)
        }
    }

}