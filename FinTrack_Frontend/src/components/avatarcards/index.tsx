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
require(['css!components/avatarcards/avatarcards.css']);

type Props = Readonly<{
    url: string | null,
    title: string | null,
    description: string | null
  }>;

export function AvatarCards({url, title, description}: Props){
    return(
        <div class="avatarcards">
            <div class="avatarImage">
                {url==null? "No Image Found": <img src={url} alt="Sorry Image Nahi mili" />}
            </div>
            <div class="avatarTitle">
                {title==null? "No Titl Found": title}
            </div>
            <div class="avatardescription">
                {description==null? "No description": description}
            </div>

        </div>
    );
};