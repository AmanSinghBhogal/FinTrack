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
import { ProfileCard } from "../profileCard/index";
// @ts-ignore
require(['css!components/profiles/profiles.css']);

type Props = Readonly<{
    data?: data[] | null;
  }>;

type data = {
    url: string | null,
    name: string | null,
    age: number | null,
    gender: string |null
}

const mydata =[
    {
        "url": "https://tinypng.com/images/social/website.jpg",
        "name": "Aman",
        "age": 22,
        "gender": "Male"
    },
    {
        "url": "https://www.petakids.com/wp-content/uploads/2019/01/bunny.jpg",
        "name": "Mausmi",
        "age": 22,
        "gender": "Female"
    },
    {
        "url": "https://www.petakids.com/wp-content/uploads/2019/01/bunny.jpg",
        "name": "ABC",
        "age": 22,
        "gender": "Male"
    },
    {
        "url": "https://www.petakids.com/wp-content/uploads/2019/01/bunny.jpg",
        "name": "ABC",
        "age": 22,
        "gender": "Male"
    },
    {
        "url": "https://www.petakids.com/wp-content/uploads/2019/01/bunny.jpg",
        "name": "ABC",
        "age": 22,
        "gender": "Male"
    },
    {
        "url": "https://www.petakids.com/wp-content/uploads/2019/01/bunny.jpg",
        "name": "ABC",
        "age": 22,
        "gender": "Male"
    },
    {
        "url": "https://www.petakids.com/wp-content/uploads/2019/01/bunny.jpg",
        "name": "ABC",
        "age": 22,
        "gender": "Male"
    },
    

]
export function Profiles({data= mydata}: Props) {
  return (
    <div class="profiles">

        {
            data==null? "NO Data found": data.map((item, key) => (
                <ProfileCard
                    key= {key}
                    url ={item.url}
                    name = {item.name}
                    age = {item.age}
                    gender = {item.gender}
                />
            ))
        }
    </div>

  );
};