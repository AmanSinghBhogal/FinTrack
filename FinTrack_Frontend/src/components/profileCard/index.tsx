/**
 * @license
 * Copyright (c) 2014, 2025, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
import { h } from "preact";
import { useRef, useState, useEffect } from "preact/hooks";
import * as ResponsiveUtils from "ojs/ojresponsiveutils";
// @ts-ignore
require(['css!components/profileCard/profileCard.css']);

type Props = Readonly<{
    url: string|null,
    name: string | null,
    age: number | null,
    gender: string|null
  }>;

export function ProfileCard({ url,name, age, gender}: Props){
    return (
        <div class= "profileCard">
            <div class= "profileimage">
                {url == null? "No Image": <img src={url} />}
                
            </div>
            <div class= "profilename">
                {name == null? "No Name Found": name}
            </div>
            <div class="profileage">
                {age == null? "No Age Found": age}
            </div>
            <div class="profilesex">
                {gender == null? "No Gender Found": gender}
            </div>
        </div>
    );
};