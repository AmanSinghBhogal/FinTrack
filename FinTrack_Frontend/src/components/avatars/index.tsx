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
import { AvatarCards } from "../avatarcards/index";
// @ts-ignore
require(['css!components/avatars/Avatars.css']);

type Props = Readonly<{
    data?: data[] | null;
  }>;

type data = {
    url: string | null,
    title: string | null,
    description: string | null
}

const mydata = [
    {
        "title": "Eum aliquid quis cupiditate.",
        "description": "Et quo fuga voluptate delectus sed sint quo repellat. Accusamus recusandae voluptas quae nam. Ab perferendis nihil velit aspernatur maxime.",
        "url": "https://picsum.photos/640/480"
      },
      {
        "title": "Mollitia aut maiores quis.",
        "description": "Voluptatibus nulla architecto quae tempora quae. Ut eligendi magnam tempora. Nemo ut aut quia quis eum quos. Natus dolores quia occaecati repellat vel sed et.",
        "url": "https://picsum.photos/640/480"
      },
      {
        "title": "Ut illo nemo et nostrum.",
        "description": "Cumque sunt a adipisci aut velit ad omnis alias. Dolor eius sit dolorum iste voluptas.",
        "url": "https://picsum.photos/640/480"
      },
      {
        "title": "Saepe eum et vero velit.",
        "description": "Ipsum voluptatibus ut voluptatum nihil in. Et eum sunt tempora dolor consequuntur. Ab nulla saepe adipisci repudiandae voluptatem voluptatibus aliquam. Enim nesciunt autem voluptas laboriosam libero.",
        "url": "https://picsum.photos/640/480"
      },
      {
        "title": "Non sunt omnis veniam quos.",
        "description": "Labore laudantium unde reiciendis magni similique quaerat itaque ea. Accusantium voluptatem repudiandae praesentium. Et dolor quisquam hic qui est adipisci alias. Officiis quas ducimus illum.",
        "url": "https://picsum.photos/640/480"
      }
]

export function Avatars({data=mydata}: Props){
    return(
        <div class="avatars">
            <div class="avatartitle">
            Avatar
            </div>
        
            <div class="cards">
                {
                        data==null? "NO Data found": data.map((item, key) => (
                            <AvatarCards
                                key= {key}
                                url ={item.url}
                                title = {item.title}
                                description = {item.description}
                            />
                        ))
                }
            </div>

        </div>
    );
};