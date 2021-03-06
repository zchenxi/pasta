/*
 * Copyright (C) 2012  Tianxiao Gu. All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 * Please contact Institute of Computer Software, Nanjing University, 
 * 163 Xianlin Avenue, Nanjing, Jiangsu Provience, 210046, China,
 * or visit moon.nju.edu.cn if you need additional information or have any
 * questions.
 */
package org.javelus;

public enum MethodUpdateType implements UpdateType {

    NONE, MC, BC,

    /* become abstract */
    DEL,
    /* become concrete */
    ADD;

    MethodUpdateType() {
    }

    public int intValue() {
        return this.ordinal();
    }

    @Override
    public boolean isDeleted() {
        return this == DEL;
    }

    @Override
    public boolean isAdded() {
        return this == ADD;
    }

    @Override
    public boolean isChanged() {
        return this == BC;
    }

    @Override
    public boolean isUnchanged() {
        return this == MC || this == NONE;
    }
}