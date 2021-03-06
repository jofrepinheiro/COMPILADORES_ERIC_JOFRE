/* This file was generated by SableCC (http://www.sablecc.org/). */

package cminus.node;

import cminus.analysis.*;

@SuppressWarnings("nls")
public final class AVoidTipo extends PTipo
{
    private TKwVoid _kwVoid_;

    public AVoidTipo()
    {
        // Constructor
    }

    public AVoidTipo(
        @SuppressWarnings("hiding") TKwVoid _kwVoid_)
    {
        // Constructor
        setKwVoid(_kwVoid_);

    }

    @Override
    public Object clone()
    {
        return new AVoidTipo(
            cloneNode(this._kwVoid_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVoidTipo(this);
    }

    public TKwVoid getKwVoid()
    {
        return this._kwVoid_;
    }

    public void setKwVoid(TKwVoid node)
    {
        if(this._kwVoid_ != null)
        {
            this._kwVoid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwVoid_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwVoid_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwVoid_ == child)
        {
            this._kwVoid_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwVoid_ == oldChild)
        {
            setKwVoid((TKwVoid) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
